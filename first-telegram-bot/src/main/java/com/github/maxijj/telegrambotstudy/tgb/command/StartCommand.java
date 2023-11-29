package com.github.maxijj.telegrambotstudy.tgb.command;

import com.github.maxijj.telegrambotstudy.tgb.service.SendBotMessageService;
import org.telegram.telegrambots.meta.api.objects.Update;

public class StartCommand implements Command {

    private final SendBotMessageService sendBotMessageService;

    public final static String START_MESSAGE = "Привет! Я TGB bot. Пока я учусь делать всякие команды, надеюсь буду" +
            " тебе полезным :)";

    public StartCommand(SendBotMessageService sendBotMessageService) {
        this.sendBotMessageService = sendBotMessageService;
    }

    @Override
    public void execute(Update update) {
        sendBotMessageService.sendMessage(update.getMessage().getChatId().toString(), START_MESSAGE);
    }
}
