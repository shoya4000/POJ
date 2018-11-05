/*Forests
Description
If a tree falls in the forest, and there's nobody there to hear, does it make a sound? This classic conundrum was coined by George
Berkeley (1685-1753), the Bishop and influential Irish philosopher whose primary philosophical achievement is the advancement of
what has come to be called subjective idealism. He wrote a number of works, of which the most widely-read are Treatise Concerning
the Principles of Human Knowledge (1710) and Three Dialogues between Hylas and Philonous (1713) (Philonous, the "lover of the mind," representing Berkeley himself).

Input
A forest contains T trees numbered from 1 to T and P people numbered from 1 to P. Standard input consists of a line containing P and
T followed by several lines, containing a pair of integers i and j, indicating that person i has heard tree j fall.

Output
People may have different opinions as to which trees, according to Berkeley, have made a sound. Output how many different opinions are
represented in the input? Two people hold the same opinion only if they hear exactly the same set of trees. You may assume that P < 100 and T < 100.

Sample Input

3 4
1 2
3 3
1 3
2 2
3 2
2 4

Sample Output

2
*/

import java.util.*;

public class problem2419
{

    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int totalPhil = scanner.nextInt();
        int totalTrees = scanner.nextInt();
        boolean[][] results = new boolean[totalPhil][totalTrees];

        while(scanner.hasNext())
        {
            int phil = scanner.nextInt();
            int tree = scanner.nextInt();
            results[phil - 1][tree - 1] = true;
        }

        int uniquePhils = 0;
        for(int i = 0; i < results.length; i++)
        {
            if (unique(results, i))
                uniquePhils++;
        }
        System.out.println(uniquePhils);
    }

    static boolean unique(boolean[][] results, int idx)
    {
        for(int j = idx + 1; j < results.length; j++)
        {
            if(Arrays.hashCode(results[idx]) == Arrays.hashCode(results[j]))
            {
                return false;
            }
        }
        return true;
    }
}