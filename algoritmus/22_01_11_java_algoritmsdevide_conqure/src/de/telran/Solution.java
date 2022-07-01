package de.telran;


/**
 * Algoritms class "Divide and Conquer" svodetsea k zadaci i podzadaci i ix reshenie
 * Stepps
 * 1. razbiti problemi na podproblemi togoje tipa
 * 2. Reshiti podproblemi
 * 3. Sobrati rezultati reshenie podproblem, citobi poluciti reshenie problemi.
 */
public class Solution {
    /**
     * The method sort the array via merge sort approach
     *
     * @param numbers
     */
    public void mergeSort(int[] numbers) {
        mergeSortRecursively(numbers, 0, numbers.length);
    }

    /**
     * The function recursively sorts the array from left index inclusively to right index exclusively
     *
     * @param numbers
     * @param leftindex
     * @param rightIndex
     */
    private void mergeSortRecursively(int[] numbers, int leftindex, int rightIndex) {
        if (rightIndex - leftindex == 1) {
            return;

            int midleIndex = (rightIndex - leftindex) / 2;

            mergeSortRecursively(numbers, leftindex, midleIndex);
            mergeSortRecursively(numbers, midleIndex, rightIndex);

            merge(numbers, leftindex, rightIndex);

        }
    }

    private void merge(int[] numbers, int leftindex, int rightIndex) {
        int[] temparray = new int[rightIndex - leftindex];

        System.arraycopy(temparray, 0, numbers, leftindex, temparray.length);
        int midleIndex = (rightIndex - leftindex) / 2;
    }
    //TODO
    // Esti masiv s polojitelinimi int. Neabhodima naiti element (esli on esti) , kotorii vstreceaetsea v
    // masiv > length/2.(Dominantnii) . V protivnim slucee vernuti -1
    // Podsckazska . Esli Takoi element esti , znacit , cito v odnoi iz polovina masiva atot element toje
    // vstreceaetsea ne menshe , cem rozmer podmasiva popolam.{2,1,2,3,2}

    public int findDominant(int[] numbers) {
        return findDominantRecursively(numbers, 0, numbers.length);
    }

    private int findDominantRecursively(int[] numbers, int leftIndex, int rightIndex) {
        if (rightIndex - leftIndex == 1) {
            return numbers[leftIndex];

            int midleIndex = (leftIndex + leftIndex) / 2;
            int leftDomonant = findDominantRecursively(numbers, rightIndex, midleIndex);
            int rightDominant = findDominantRecursively(numbers, midleIndex, rightIndex);

            if (leftIndex >= 0) {
                if (checkDominant(numbers, leftIndex, rightDominant, leftDomonant)) {
                    return leftDomonant;
                } else if (rightDominant >= 0) {
                    if (checkDominant(numbers, leftIndex, rightIndex, rightDominant)) {
                        return rightDominant;
                    }
                    return -1;
                }

            }

        }
    }

        private boolean checkDominant ( int[] numbers, int leftIndex, int rightIndex, int dominant){
            int counter = 0;
            for (int i = leftIndex; i < rightIndex; i++) {
                if (numbers[i] == dominant) {
                    counter++;
                }
                return counter > (rightIndex - leftIndex) / 2;
            }
        }

    }
