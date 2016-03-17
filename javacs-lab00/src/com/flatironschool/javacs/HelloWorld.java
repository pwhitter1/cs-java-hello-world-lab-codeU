package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
	String version_str;
	Double version_double;
        
	version_str = System.getProperty("java.specification.version");
	version_double = Double.parseDouble(version_str);
	
	return version_double;
    }

    public static void main(String[] args) {
	 System.out.println(getVersion());
    }
}
