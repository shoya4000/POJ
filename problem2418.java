/*Hardwood Species
Description
Hardwoods are the botanical group of trees that have broad leaves, produce a fruit or nut, and generally go dormant in the winter.
America's temperate climates produce forests with hundreds of hardwood species -- trees that share certain biological characteristics.
Although oak, maple and cherry all are types of hardwood trees, for example, they are different species. Together, all the hardwood
species represent 40 percent of the trees in the United States.
On the other hand, softwoods, or conifers, from the Latin word meaning "cone-bearing," have needles. Widely available US softwoods
include cedar, fir, hemlock, pine, redwood, spruce and cypress. In a home, the softwoods are used primarily as structural lumber
such as 2x4s and 2x6s, with some limited decorative applications.
Using satellite imaging technology, the Department of Natural Resources has compiled an inventory of every tree standing on a
particular day. You are to compute the total fraction of the tree population represented by each species.

Input
Input to your program consists of a list of the species of every tree observed by the satellite; one tree per line. No species name exceeds 30 characters. There are no more than 10,000 species and no more than 1,000,000 trees.

Output
Print the name of each species represented in the population, in alphabetical order, followed by the percentage of the population it represents, to 4 decimal places.

Sample Input

Red Alder
Ash
Aspen
Basswood
Ash
Beech
Yellow Birch
Ash
Cherry
Cottonwood
Ash
Cypress
Red Elm
Gum
Hackberry
White Oak
Hickory
Pecan
Hard Maple
White Oak
Soft Maple
Red Oak
Red Oak
White Oak
Poplan
Sassafras
Sycamore
Black Walnut
Willow

Sample Output

Ash 13.7931
Aspen 3.4483
Basswood 3.4483
Beech 3.4483
Black Walnut 3.4483
Cherry 3.4483
Cottonwood 3.4483
Cypress 3.4483
Gum 3.4483
Hackberry 3.4483
Hard Maple 3.4483
Hickory 3.4483
Pecan 3.4483
Poplan 3.4483
Red Alder 3.4483
Red Elm 3.4483
Red Oak 6.8966
Sassafras 3.4483
Soft Maple 3.4483
Sycamore 3.4483
White Oak 10.3448
Willow 3.4483
Yellow Birch 3.4483
*/

import java.util.*;

public class problem2418
{
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        float total = 0;
        HashMap<String, Integer> hmap = new HashMap<String, Integer>();

        while(scanner.hasNext())
        {
            String temp = scanner.nextLine();
            if(!hmap.containsKey(temp))
            {
                hmap.put(temp, 1);
            }
            else
            {
                hmap.put(temp, hmap.get(temp) + 1);
            }
            total++;
        }

        List<String> l = new ArrayList<String>(hmap.keySet());
        Collections.sort(l);
        for(String key : l)
        {
            System.out.printf("%s %.4f\n", key, hmap.get(key) / total * 100.0 );
        }
    }
}