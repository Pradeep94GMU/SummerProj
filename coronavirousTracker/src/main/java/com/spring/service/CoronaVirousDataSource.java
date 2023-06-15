package com.spring.service;

import java.io.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.rmi.registry.LocateRegistry;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import com.spring.model.LocationStat;

import jakarta.annotation.PostConstruct;

@Service
public class CoronaVirousDataSource {

	private static String VirousDataFile = "https://raw.githubusercontent.com/CSSEGISandData/COVID-19/master/csse_covid_19_data/csse_covid_19_time_series/time_series_covid19_confirmed_global.csv";

	private List<LocationStat> allStats = new ArrayList<>();
	
	

	public List<LocationStat> getAllStats() {
		return allStats;
	}



	public void setAllStats(List<LocationStat> allStats) {
		this.allStats = allStats;
	}



	public static String getVirousDataFile() {
		return VirousDataFile;
	}



	@PostConstruct
	public void fetchVirousData() throws IOException, InterruptedException {

		List<LocationStat> oldStats = new ArrayList<>();

		HttpClient client = HttpClient.newHttpClient();

		HttpRequest request = HttpRequest.newBuilder().uri(URI.create(VirousDataFile)).build();

		HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());

		
		StringReader csvBodyReader = new StringReader(httpResponse.body());

		@SuppressWarnings("deprecation")
		Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(csvBodyReader);
		for (CSVRecord record : records) {
			LocationStat lstat = new LocationStat();

			lstat.setState(record.get("Province/State"));
			lstat.setCountry(record.get("Country/Region"));
			int latestCases = Integer.parseInt(record.get(record.size() - 1));
			
			lstat.setLatestTotalCases(latestCases);
			

			oldStats.add(lstat);

		}

		this.allStats = oldStats;
	}

}
