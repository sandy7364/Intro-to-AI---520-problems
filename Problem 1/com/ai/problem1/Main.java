package com.ai.problem1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String... args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Maze maze = new Maze();
		maze.configureFrame(maze, 2020);
	}
}
