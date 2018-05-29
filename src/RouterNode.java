/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Maxwell Sanders
 */
public class RouterNode {
    int[] costs;
            
    public RouterNode() {
         //the routing table as an int array
        costs = new int[6];
        for(int i = 0; i < 6; i ++){
            costs[i] = 16;
        }
    }

    public void setLink(int link, int cost) {
        System.out.println(link + " " + cost);
        costs[link - 1] = cost; //set the link to the cost
    }

    //cost to get to the node
    public int getCost(int index){
        return costs[index];
    }
}
