package ru.job4j.map;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        int count = 0;
        int totalScore = 0;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
                count++;
            }
        }
        return totalScore / (double) count;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {

        List<Label> tempList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            tempList.add(new Label(pupil.name(), (double) totalScore / pupil.subjects().size()));
        }
        return tempList;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        List<Label> tempList = new ArrayList<>();
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                tempMap.merge(subject.name(), subject.score(), (oldV, newV) -> oldV + newV);
            }
        }
        for (String str : tempMap.keySet()) {
            tempList.add(new Label(str, tempMap.get(str) / (double) pupils.size()));
        }
        return tempList;
    }

    public static Label bestStudent(List<Pupil> pupils) {

        List<Label> tempList = new ArrayList<>();
        for (Pupil pupil : pupils) {
            int totalScore = 0;
            for (Subject subject : pupil.subjects()) {
                totalScore += subject.score();
            }
            tempList.add(new Label(pupil.name(), totalScore));
        }
        tempList.sort(Comparator.naturalOrder());
        return tempList.get(tempList.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        List<Label> tempList = new ArrayList<>();
        Map<String, Integer> tempMap = new LinkedHashMap<>();
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                tempMap.merge(subject.name(), subject.score(), (oldV, newV) -> oldV + newV);
            }
        }
        for (String str : tempMap.keySet()) {
            tempList.add(new Label(str, tempMap.get(str)));
        }
        tempList.sort(Comparator.naturalOrder());
        return tempList.get(tempList.size() - 1);
    }
}
