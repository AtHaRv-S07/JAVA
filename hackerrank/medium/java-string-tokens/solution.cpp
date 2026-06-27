

    static boolean isAnagram(String a, String b) {
        // Complete the function
        a = a.toLowerCase();
    b = b.toLowerCase();

    // Step 1: Check lengths
    if (a.length() != b.length()) {
        return false;
    }

    // Step 2: Convert strings to character arrays
    char[] arr1 = a.toCharArray();
    char[] arr2 = b.toCharArray();

    // Step 3: Sort arr1 using Bubble Sort
    for (int i = 0; i < arr1.length - 1; i++) {
        for (int j = 0; j < arr1.length - 1 - i; j++) {
            if (arr1[j] > arr1[j + 1]) {
                char temp = arr1[j];
                arr1[j] = arr1[j + 1];
                arr1[j + 1] = temp;
            }
        }
    }

    // Step 4: Sort arr2 using Bubble Sort
    for (int i = 0; i < arr2.length - 1; i++) {
        for (int j = 0; j < arr2.length - 1 - i; j++) {
            if (arr2[j] > arr2[j + 1]) {
                char temp = arr2[j];
                arr2[j] = arr2[j + 1];
                arr2[j + 1] = temp;
            }
        }
    }

    // Step 5: Compare sorted arrays
    for (int i = 0; i < arr1.length; i++) {
        if (arr1[i] != arr2[i]) {
            return false;
        }
    }

    return true;
}
