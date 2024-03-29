package homework.collectionexample;

import java.util.*;

public class CollectionExampleMap {
    public static void main(String[] args) {


    }

    //Ունենք FootballTeamMember-ի լիստ, պետք է ստանանք HashMap որտեղ կեյ-ը կլինի խաղացողի համարը, իսկ վելյուն իրա անունը։
    static Map<Integer, String> createFootballTeam(List<FootballTeamMember> members) {
        Integer number = 0;
        String name = "";
        Map<Integer, String> FootballTeam = new HashMap<>();
        for (int i = 0; i < members.size(); i++) {
            FootballTeamMember footballPlayer = members.get(i);
            FootballTeam.put(number = footballPlayer.getNumber(), name = footballPlayer.getName());
        }
        return FootballTeam;
    }

    //Մեթոդի մեջ պետք է տրված մապ-ից ջնջենք removedNumber համարը եթե կա, ու վերադարձնենք true, եթե չկա վերադարձնենք false
    static boolean removeFromMap(Map<Integer, String> memberMap, Integer removedNumber) {
        boolean b = memberMap.containsKey(removedNumber);
        if (b) {
            memberMap.remove(removedNumber);
        }
        return b;
    }

    //Մեթոդով տպելու ենք միայն անունները
    static void printAllMemberNames(Map<Integer, String> memberMap) {
        Collection<String> values = memberMap.values();
        for (String value : values) {
            System.out.print(value + " ");
        }
    }

    //Մեթոդով տպելու ենք թե համարը, թե խաղացողի անունը հետյալ ձև՝
    // 11 - Poxos Poxosyan
    // 12 - Petros Petrosyan
    static void printAllMembers(Map<Integer, String> memberMap) {
        Set<Map.Entry<Integer, String>> entries = memberMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            System.out.println(entry.getKey() + "-" + entry.getValue());
        }
    }


    static class FootballTeamMember {
        private int number;
        private String name;

        public FootballTeamMember(int number, String name) {
            this.number = number;
            this.name = name;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
