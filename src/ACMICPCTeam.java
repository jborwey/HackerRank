/**
 * Created by jb039k on 12/15/2016.
 */

import java.util.BitSet;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ACMICPCTeam {

    public static void makeTeams(int numPlayers, int numTopics, Map<Integer, BitSet> players){
        int completeTeams = 0;

        for(Integer player : players.keySet()){
            for(int player2=player+1; player2<numPlayers; player2++){
                BitSet tempSet = (BitSet) players.get(player).clone();
                BitSet tempSet2 = (BitSet) players.get(player2).clone();
                tempSet.or(tempSet2);
                int bLen = tempSet.cardinality();
                if(bLen==numTopics){
                    completeTeams++;
                }
            }
        }
        System.out.println(numTopics);
        System.out.println(completeTeams);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int numPeople = sc.nextInt();
        int numTopics = sc.nextInt();
        Map<Integer, BitSet> players = new HashMap<>();
        BitSet bitset;

        for(int i=0; i<numPeople; i++){
            bitset = new BitSet(numTopics);
            String player = sc.next();
            for(int j=0; j<player.length(); j++){
                char bit = player.charAt(j);
                if(bit == '1'){
                    bitset.set(j);
                }
            }
            players.put(i, bitset);
        }
        makeTeams(numPeople, numTopics, players);
    }
}

//        bitSet.set(0);
//        bitSet.set(2);
//        bitSet.set(4);
//
//        bitSet2.set(0);
//        bitSet2.set(1);
//        bitSet2.set(3);
//        bitSet.or(bitSet2);
//
//        System.out.println(bitSet);