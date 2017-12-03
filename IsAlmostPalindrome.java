 public boolean isAlmostPalindrome(String input) {
        boolean mismatched = false;
        for(int i = 0; i < input.length() / 2; i++) {
            char leftChar = input.charAt(i);
            char rightChar = input.charAt(input.length() - i - 1);

            // We allow one mismatch
            if (leftChar != rightChar) {
                if (mismatched) {
                    return false;
                }
                mismatched = true;
            }
        }

        return true;
    }

    @Test
    public void quickTestCase() {
        assertThat(isAlmostPalindrome("abccba")).isEqualTo(true);
        assertThat(isAlmostPalindrome("abccbx")).isEqualTo(true);
        assertThat(isAlmostPalindrome("abccfx")).isEqualTo(false);
    }
