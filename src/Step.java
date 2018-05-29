/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MasterCommander
 */
public class Step {
    RouterNode[] nodes;
    
    public Step(){
        nodes = new RouterNode[6];
        for(int i = 0; i < 6; i ++){
            nodes[i] = new RouterNode();
            nodes[i].setLink(i + 1, 0);
        }
    }
    
    public void setNode(int position, int link, int cost){
        System.out.println(position + " " + link + " " + cost);
        nodes[position - 1].setLink(link, cost); //set the link at node pos - 1
    }
    
    public RouterNode getNode(int index){
        return nodes[index];
    }
    
    //checks if two steps are equal to each other
    public boolean equals(Step step){
        for(int i = 0; i < 6; i ++){
            for(int j = 0; j < 6; j ++){
                if(this.getNode(i).getCost(j) != step.getNode(i).getCost(j)){
                    return false;
                }
            }
        }        
        return true;
    }
}
