package Tutorial_4_5.Arrays;

/**
 * @author Huy
 */
public class Arrays {

    /**
     * count the number of elements of an array of integers that are negative
     * @requires a != null
     * @effects
     *  return the number of elements of an array of integers that are negative
     */
    public int countNegative(int a[]) throws NullPointerException {
        try {
            int totalNegative = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] < 0) {
                    totalNegative++;
                }
            }
            return totalNegative;
        } catch(NullPointerException e) {
            throw new NullPointerException(e + ". Array must have at least 1 element");
        }
    }

    /**
     * find the minimum element in an array of integers
     *
     * @requires a != null
     * @effects
     *  return the minimum element in an array of integers
     */
    public int min(int a[]) throws NullPointerException {
        try {
            int min = a[0];
            for(int i = 1; i < a.length; i++){
                if(a[i] < min) {
                    min = a[i];
                }
            }
            return min;
        } catch (NullPointerException e) {
            throw new NullPointerException(e + ". Array must have at least 1 element");
        }
    }

    /**
     * determine whether an array of integers is in ascending order
     *
     * @requires a != null
     * @effects
     *  if (a[0] < a[1] < ... < a[n])
     *      return true
     *  else
     *      return false
     */
    public boolean isAscSorted(int a[]) throws NullPointerException {
        try {
            for(int i = 0; i < a.length; i++) {
                if(a[i] >= a[i+1]) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException e) {
            throw new NullPointerException(e + ". Array must have at least 1 element");
        }
    }

    /**
     * find the length of an array of CHARs until to the character `\u0000`
     *
     * @requires a != null
     * @effects
     *  return the length of an array of CHARs until to the character `\u0000`
     *
     */
    public int length(char a[]) throws NullPointerException {
        try {
            int length = 0;
            for(int i = 0; i < a.length; i++) {
                if(a[i] != '\u0000'){
                    length++;
                }
            }
            return length;
        } catch (NullPointerException e) {
            throw new NullPointerException(e + ". Array must have at least 1 element");
        }
    }

    /**
     * find the median of an array of real(integers)
     *
     * @requires a != null
     * @effects
     *  {@link #isAscSorted(int[])} determine the array is in ascending order
     *  return median of an array of real(integers)
     */
    public double median(int a[]) throws NullPointerException {
        try {
            int length = a.length;
            if(!isAscSorted(a)) {
                java.util.Arrays.sort(a);
            }
            if(length % 2 != 0) {
                return a[(length + 1) / 2];
            } else {
                return (a[length / 2] + a[length / 2 + 1]) / 2;
            }
        } catch (NullPointerException e) {
            throw new NullPointerException(e + ". Array must have at least 1 element");
        }
    }

    /**
     * @requires a != null /\ b != null
     * @effects
     *  given two arbitrary arrays of real, a and b,  determine
     *  if `a is subset of b`
     *      return String "a is subset of b"
     *  else if `b is subset of a`
     *      return String "b is subset of a"
     *  else if
     *      return String "a is intersected by b"
     *  else if `a = b`
     *      return String "a = b "
     *  else
     *      return String "Match none case"
     */
    public String compare(int a[], int b[]) {
        return "TODO";
    }

    /**
     * compute the frequencies of each element of an array of real(integers)
     *
     * @requires a != null
     * @effects
     *  return String contains frequencies of each element of an array of real(integers)
     */
    public String freq(int a[]) throws NullPointerException {
        return "TODO";
    }
}
