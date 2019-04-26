package com.sh.java8.explorer;

import java.util.List;

public class ExplorerResult {
	private Statistics statistics;
	private List<TypeInfo> typeInfos;

	public Statistics getStatistics() {
		return statistics;
	}

	public void setStatistics(Statistics statistics) {
		this.statistics = statistics;
	}

	public List<TypeInfo> getTypeInfos() {
		return typeInfos;
	}

	public void setTypeInfos(List<TypeInfo> typeInfos) {
		this.typeInfos = typeInfos;
	}
}
