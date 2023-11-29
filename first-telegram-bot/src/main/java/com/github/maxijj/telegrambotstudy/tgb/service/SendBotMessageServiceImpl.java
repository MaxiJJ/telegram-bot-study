package com.github.maxijj.telegrambotstudy.tgb.service;

import com.github.maxijj.telegrambotstudy.tgb.bot.TgbFirstBot;
import org.jvnet.hk2.annotations.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Service
public class SendBotMessageServiceImpl implements SendBotMessageService {

    private final TgbFirstBot tgbFirstBot;

    @Autowired
    public SendBotMessageServiceImpl(TgbFirstBot tgbFirstBot) {
        this.tgbFirstBot = tgbFirstBot;
    }

    @Override
    public void sendMessage(String chatId, String message) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.setChatId(chatId);
        sendMessage.enableHtml(true);
        sendMessage.setText(message);

        try {
            tgbFirstBot.execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
}
