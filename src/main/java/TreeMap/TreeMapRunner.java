package TreeMap;

import java.util.*;

public class TreeMapRunner {
    public static void main(String[] args) {
        NavigableMap<AverageStudentGrade, Set<SubjectGrate>> grades = createGrates();
        printGrades(grades, false);
        AverageStudentGrade border = grades.ceilingKey(new AverageStudentGrade("", 80));
        NavigableMap<AverageStudentGrade, Set<SubjectGrate>> scholarshipStudent =(NavigableMap<AverageStudentGrade, Set<SubjectGrate>>) grades.tailMap(border);
        System.out.println("---------------------------------------------------");
        System.out.println("ScholarshipStudent");
        System.out.println(scholarshipStudent);
        printGrades(scholarshipStudent, false);
        System.out.println("Contender student");
        AverageStudentGrade contender = grades.ceilingKey(border);
        System.out.println(contender);
        System.out.println("Highest grade student");
        System.out.println(scholarshipStudent.descendingMap().firstEntry());
    }

    private static void printGrades(Map<AverageStudentGrade, Set<SubjectGrate>> grades, boolean printValue) {
        Set<AverageStudentGrade> averageGrades = grades.keySet();
        for (AverageStudentGrade gr : averageGrades) {
            System.out.println(gr);
            if (printValue) {
                System.out.println(grades.get(gr));
            }
        }
    }

    private static NavigableMap<AverageStudentGrade, Set<SubjectGrate>> createGrates() {
        Set<SubjectGrate> alexGrades = new HashSet<>();
        alexGrades.add(new SubjectGrate("Mathematica", 89));
        alexGrades.add(new SubjectGrate("Physics", 65));
        alexGrades.add(new SubjectGrate("History", 95));
        alexGrades.add(new SubjectGrate("Literature", 90));
        alexGrades.add(new SubjectGrate("Chemistry", 75));

        Set<SubjectGrate> jamesGrades = new HashSet<>();
        jamesGrades.add(new SubjectGrate("Mathematica", 75));
        jamesGrades.add(new SubjectGrate("Physics", 80));
        jamesGrades.add(new SubjectGrate("History", 55));
        jamesGrades.add(new SubjectGrate("Literature", 70));
        jamesGrades.add(new SubjectGrate("Chemistry", 80));

        Set<SubjectGrate> antonyGrades = new HashSet<>();
        antonyGrades.add(new SubjectGrate("Mathematica", 93));
        antonyGrades.add(new SubjectGrate("Physics", 91));
        antonyGrades.add(new SubjectGrate("History", 82));
        antonyGrades.add(new SubjectGrate("Literature", 78));
        antonyGrades.add(new SubjectGrate("Chemistry", 88));

        Set<SubjectGrate> viktoriaGrades = new HashSet<>();
        viktoriaGrades.add(new SubjectGrate("Mathematica", 73));
        viktoriaGrades.add(new SubjectGrate("Physics", 65));
        viktoriaGrades.add(new SubjectGrate("History", 75));
        viktoriaGrades.add(new SubjectGrate("Literature", 66));
        viktoriaGrades.add(new SubjectGrate("Chemistry", 50));

        Set<SubjectGrate> alinaGrades = new HashSet<>();
        alinaGrades.add(new SubjectGrate("Mathematica", 90));
        alinaGrades.add(new SubjectGrate("Physics", 70));
        alinaGrades.add(new SubjectGrate("History", 78));
        alinaGrades.add(new SubjectGrate("Literature", 88));
        alinaGrades.add(new SubjectGrate("Chemistry", 89));

        NavigableMap<AverageStudentGrade, Set<SubjectGrate>> map = new TreeMap<>();
        map.put(new AverageStudentGrade("Alex", calcAverage(alexGrades)), alexGrades);
        map.put(new AverageStudentGrade("James", calcAverage(jamesGrades)), jamesGrades);
        map.put(new AverageStudentGrade("Antony", calcAverage(antonyGrades)), antonyGrades);
        map.put(new AverageStudentGrade("Alina", calcAverage(alinaGrades)), alinaGrades);
        map.put(new AverageStudentGrade("Viktoria", calcAverage(viktoriaGrades)), viktoriaGrades);

        return map;
    }

    private static float calcAverage(Set<SubjectGrate> grates) {
        float sum = 0f;
        for (SubjectGrate sg : grates) {
            sum += sg.getGrate();
        }
        return sum / grates.size();
    }
}
