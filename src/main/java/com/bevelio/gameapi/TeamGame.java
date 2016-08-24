package com.bevelio.gameapi;

import java.util.ArrayList;

import org.bukkit.event.Listener;

import xyz.jadonfowler.gameapi.GameAPI;
import xyz.jadonfowler.gameapi.game.Arena;
import xyz.jadonfowler.gameapi.game.Game;

public class TeamGame extends Game
{

	public TeamGame(String name, String desc) 
	{
		super(name, desc, GameAPI.getGameLobby(), new ArrayList<String>(), new ArrayList<Arena>(), new ArrayList<Listener>());
	}
	
}
