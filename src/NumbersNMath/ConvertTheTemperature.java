package NumbersNMath;

// https://leetcode.com/problems/convert-the-temperature/
// Runtime 0 ms Beats 100%
// Memory 42.8 MB Beats 24.45%

public class ConvertTheTemperature{
    public double[] convertTemperature(double celsius) {
        return new double[]{(celsius+273.15),((celsius * 1.80) + 32.00)};
    }
}