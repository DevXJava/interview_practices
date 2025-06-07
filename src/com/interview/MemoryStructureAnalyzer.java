package com.interview;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.lang.management.MemoryPoolMXBean;
import java.lang.management.MemoryUsage;
import java.util.List;

public class MemoryStructureAnalyzer {

	public static void analyzeMemoryUsage() {
		// Get the Memory MBean
		MemoryMXBean memoryMXBean = ManagementFactory.getMemoryMXBean();
		// Get memory pools
		List<MemoryPoolMXBean> memoryPoolMXBeans = ManagementFactory.getMemoryPoolMXBeans();
		System.out.println("Memory Usage Analysis");
		System.out.println("--------------------");

		// Analyze heap memory
		MemoryUsage heapUsage = memoryMXBean.getHeapMemoryUsage();
		System.out.printf("Heap Memory: used=%d MB, committed=%d MB, max=%d MB%n", heapUsage.getUsed() / (1024 * 1024),
				heapUsage.getCommitted() / (1024 * 1024), heapUsage.getMax() / (1024 * 1024));

		// Analyze non-heap memory (metaspace, code cache, etc.)
		MemoryUsage nonHeapUsage = memoryMXBean.getNonHeapMemoryUsage();
		System.out.printf("Non-Heap Memory: used=%d MB, committed=%d MB%n", nonHeapUsage.getUsed() / (1024 * 1024),
				nonHeapUsage.getCommitted() / (1024 * 1024));

		// Analyze individual memory pools
		for (MemoryPoolMXBean pool : memoryPoolMXBeans) {
			MemoryUsage poolUsage = pool.getUsage();
			System.out.printf("%s: used=%d MB, committed=%d MB, max=%d MB%n", pool.getName(),
					poolUsage.getUsed() / (1024 * 1024), poolUsage.getCommitted() / (1024 * 1024),
					poolUsage.getMax() / (1024 * 1024));
		}
	}

	public static void main(String[] args) {
		MemoryStructureAnalyzer.analyzeMemoryUsage();

	}

}
