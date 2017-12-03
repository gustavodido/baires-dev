public int mostPopularNumber(List<Integer> numbers, int arrayLength) {
    // I would use stream().groupingBy() and solve in one method chain,
    // but let' solve the exercise...

    Map<Integer, Integer> frequencyMap  = new HashMap<>();
    for (int i = 0; i < arrayLength; i++) {
        int currentNumber = numbers.get(i);
        int currentFrequency = frequencyMap.getOrDefault(currentNumber, 0);

        frequencyMap.put(currentNumber, currentFrequency + 1);
    }

    Entry<Integer, Integer> maxEntry = null;
    for (Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
        if (maxEntry == null || entry.getValue().compareTo(maxEntry.getValue()) > 0) {
            maxEntry = entry;
        }
    }

    return maxEntry.getKey();
}

@Test
public void quickTestCase() {
    assertThat(mostPopularNumber(newArrayList(34,31,34,77,82), 5)).isEqualTo(34);
    assertThat(mostPopularNumber(newArrayList(22,101,102,101,102,525,88), 7)).isEqualTo(101);
    assertThat(mostPopularNumber(newArrayList(66), 1)).isEqualTo(66);
    assertThat(mostPopularNumber(newArrayList(14, 14, 2342, 2342, 2342), 5)).isEqualTo(2342);
    assertThat(mostPopularNumber(newArrayList(2, 2, 2, 1, 1, 1), 6)).isEqualTo(1);
    assertThat(mostPopularNumber(newArrayList(1, 1, 1, 2, 2, 2), 6)).isEqualTo(1);
}
