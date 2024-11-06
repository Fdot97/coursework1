static int[] average_grades(int grades[][], int weights[]) {
    int numberOfStudents = grades.length;
    int numberOfComponents = grades[0].length;
    int[] weightedAverages = new int[numberOfStudents];
    for (int i = 0; i < numberOfStudents; i++) {
        int totalWeightedGrades = 0;
        for (int j = 0; j < numberOfComponents; j++) {
            int weightedGrade = (grades[i][j] * weights[j]) / 100;
            totalWeightedGrades += weightedGrade;
        }
        weightedAverages[i] = totalWeightedGrades;
    }
    return weightedAverages;
    
}