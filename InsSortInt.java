import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InsSortInt 
{
    public static void main(String[] args) throws FileNotFoundException
    {
        File obj = new File("randInts.txt");
        Scanner sc = new Scanner(obj);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        while (sc.hasNextInt())
        {
            nums.add(sc.nextInt());
        }
        sort(nums);
    }

    public static void sort(ArrayList<Integer> nums)
    {
        for (int i = 1; i < nums.size(); i++)
        {
            int n1 = nums.get(i);
            int j = i - 1;
            while (j >= 0 && nums.get(j) > n1)
            {
                nums.set(j + 1, nums.get(j));
                j = j - 1;
            }
            nums.set(j + 1, n1);
        }
        System.out.println(nums.get(0));
        System.out.println(nums.get(nums.size() - 1));
        return;
    }
}
