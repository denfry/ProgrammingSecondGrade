package lab2_2;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Product {
    private final String name;
    private final double defectPercentage;

    public Product(String name, double defectPercentage) {
        this.name = name;
        this.defectPercentage = defectPercentage;
    }

    public String getName() {
        return name;
    }

    public double getDefectPercentage() {
        return defectPercentage;
    }
}

