package com.sh.java6.compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * A comparable object is capable of comparing itself with another object. 
 * The class itself must implements the java.lang.Comparable interface in order to be able to compare its instances.
 * 
 * Imp:
 * Comparable is an interface defining a strategy of comparing an object with other objects of the same type. This is called the class's “natural ordering”.
 */

class Player {

	private int ranking;
	private String name;
	private int age;

	public Player(int i, String string, int j) {
		this.ranking = i;
		this.name = string;
		this.age = j;
	}

	public int getRanking() {
		return ranking;
	}

	public void setRanking(int ranking) {
		this.ranking = ranking;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}

class ComparablePlayer extends Player implements Comparable<Player> {
    
    public ComparablePlayer(int i, String string, int j) {
		super(i, string, j);
	}

    public int compareTo(Player otherPlayer) {
        return (this.getRanking() - otherPlayer.getRanking());
    }
}

public class ComparableExample {
	public static void main(String[] args) {
		List<Player> footballTeam = new ArrayList<>();
		Player player1 = new Player(59, "John", 20);
		Player player2 = new Player(67, "Roger", 22);
		Player player3 = new Player(45, "Steven", 24);
		footballTeam.add(player1);
		footballTeam.add(player2);
		footballTeam.add(player3);

		
		// The method sort(List<T>) in the type Collections is not applicable for the arguments (List<Player>)
		// Collections.sort(footballTeam);
		
		List<ComparablePlayer> cricketTeam = new ArrayList<>();
		ComparablePlayer pc1 = new ComparablePlayer(59, "John", 20);
		ComparablePlayer pc2 = new ComparablePlayer(67, "Roger", 22);
		ComparablePlayer pc3 = new ComparablePlayer(45, "Steven", 24);
		cricketTeam.add(pc1);
		cricketTeam.add(pc2);
		cricketTeam.add(pc3);
		System.out.println("Before Sorting : " + cricketTeam);
		Collections.sort(cricketTeam);
		System.out.println("After Sorting : " + cricketTeam);
	}
}
