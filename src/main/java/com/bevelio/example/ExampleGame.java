package com.bevelio.example;

import java.util.ArrayList;
import java.util.HashMap;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.event.Listener;

import xyz.jadonfowler.gameapi.game.Arena;
import xyz.jadonfowler.gameapi.game.Game;
import xyz.jadonfowler.gameapi.game.GameRunnable;
import xyz.jadonfowler.gameapi.game.Map;
import xyz.jadonfowler.gameapi.game.Team;

public class ExampleGame 
{
	public ExampleGame()
	{
		ArrayList<String> pre = new ArrayList<String>();
		ArrayList<Arena> as = new ArrayList<Arena>();
		ArrayList<Listener> lis = new ArrayList<Listener>();
		ArrayList<Team> ts = new ArrayList<Team>();
		ArrayList<Map> maps = new ArrayList<Map>();

		Team p = Team.PLAYERS(-1);

		HashMap<Team, Location> spawns = new HashMap<Team, Location>();
		spawns.put(p, new Location(Bukkit.getWorld("testmap"), 0, 64, 0));
		
		maps.add(new Map("TestMap", "testmap", "Mojang", spawns));

		Arena arena = new Arena(1, ts, maps, new GameRunnable() {

			@Override
			public void start() 
			{
				
			}

			@Override
			public void stop()
			{
				
			}

			@Override
			public void win(Team team) 
			{
				
			}
			
		});
		as.add(arena);

		Game game = new Game("PaintBall", "Shoot your paintballs at everyone!", new Location(null, 0, 0, 0), pre, as, lis);
	}
}
