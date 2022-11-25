package com.elbrus;

import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;

public class HelloWorld {
    public static void main(String... args) {
        int mb = 1024 * 1024;
        MemoryMXBean memoryBean = ManagementFactory.getMemoryMXBean();
        long xmx = memoryBean.getHeapMemoryUsage().getMax() / mb;
        long xms = memoryBean.getHeapMemoryUsage().getInit() / mb;

        System.out.printf("Initial Memory (xms) : %smb%n", xms);
        System.out.printf("Max Memory (xmx) : %smb%n", xmx);

        System.out.println("Hello world " + args[0]);
    }
}
