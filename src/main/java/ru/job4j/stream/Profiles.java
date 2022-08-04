package ru.job4j.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public static List<Address> collect(List<Profile> profiles) {
        return profiles.stream()
                .map(Profile::getAddress)
                .collect(Collectors.toList());
    }

    public static List<Address> collectSortWithoutDuplicate(List<Profile> profiles) {
         profiles.stream().sorted((left, right) -> left.getAddress().getCity()
                .compareTo(right.getAddress().getCity()));
         return profiles.stream().map(Profile::getAddress).distinct().collect(Collectors.toList());
    }
}