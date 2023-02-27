package drawtree;
/**
 *
 * @author lucasmalave
 */
public class DrawTree 
{
    public String[] draw(int[] parents, String[] names)
    {
        /*int[] parents = {-1,0,1,1,0,0,5,5};
        String[] names = {"Root","SubB","LEAF1","LEAF2","LEAF3","SubA","LEAF4","LEAF5"};*/
        int num = parents.length;
        String[] arr = new String[num];
        int[] depths = new int[num];
        int maxDepth = 0;
        
        for (int i = 0; i < num; i++) 
        {
            int depth = 0;
            int x = parents[i];
            
            while (x != -1)
            {
                depth++;
                x = parents[x];
            }
            
            depths[i] = depth;
            maxDepth = Math.max(depth, maxDepth);
        }
        
        for (int i = 0; i < num; i++)
        {
            String str = "";
            int count = depths[i];
            
            while (count-- > 0) 
                str += "  ";
            
            if (i == 0)
                arr[i] = str + "+-" + names[i];
            else
                arr[i] = str + "+-" + names[i] + (depths[i] < maxDepth ? " |" : "");
        }
        
        /*for(int i = 0; i < arr.length; i++)
            System.out.println(arr[i]); */
        
        return arr;
    }
}