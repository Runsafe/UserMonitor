package no.runsafe.usermonitor;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.usermonitor.scoreboard.PlayerCounters;

public class Plugin extends RunsafeConfigurablePlugin
{
	@Override
	protected void PluginSetup()
	{
		addComponent(PlayerCounters.class);
	}
}
