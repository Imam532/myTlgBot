package telegramApp.dto;

import telegramApp.model.TelegramMessage;

public class SongRequest {
    private Long chatId;
    private String authorName;
    private String trackName;
    private Long songId;

    public SongRequest(TelegramMessage telegramMessage) {
        this.chatId = telegramMessage.getChatId();
        this.authorName = telegramMessage.getPerformerName();
        this.trackName = telegramMessage.getSongName();
        this.songId = telegramMessage.getSongId();
    }

    public SongRequest(Long chatId, String authorName, String trackName) {
        this.chatId = chatId;
        this.authorName = authorName;
        this.trackName = trackName;
    }

    public Long getSongId() {
        return songId;
    }

    public void setSongId(Long songId) {
        this.songId = songId;
    }

    public Long getChatId() {
        return chatId;
    }

    public void setChatId(Long chatId) {
        this.chatId = chatId;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getTrackName() {
        return trackName;
    }

    public void setTrackName(String trackName) {
        this.trackName = trackName;
    }
}
