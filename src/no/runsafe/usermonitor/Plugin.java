package no.runsafe.usermonitor;

import no.runsafe.framework.RunsafeConfigurablePlugin;
import no.runsafe.framework.features.Events;
import no.runsafe.usermonitor.scoreboard.PlayerCounters;

public class Plugin extends RunsafeConfigurablePlugin
{
	@Override
	protected void pluginSetup()
	{
		addComponent(Events.class);
		addComponent(PlayerCounters.class);
	}
}
