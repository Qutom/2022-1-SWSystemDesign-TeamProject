package com.discord.bot.commands.musiccommands.ChannelValid;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class IsUserInVoiceChannel implements ValidStrategy{
    @Override
    public boolean isValid(SlashCommandInteractionEvent event) {
        return event.getMember().getVoiceState().inAudioChannel();
    }
}