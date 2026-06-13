package com.tvoi.app;

import java.util.ArrayList;
import java.util.List;

public class ChannelList {

    /**
     * Lista de canais abertos brasileiros via streams HLS públicos.
     * Sem login, sem ads, sem bloqueio.
     */
    public static List<Channel> getChannels() {
        List<Channel> list = new ArrayList<>();

        // ── ABERTOS ──────────────────────────────────────────────────
        list.add(new Channel("TV Brasil",
                "https://svs.itv.workers.dev/tvbrasil",
                "Abertos", "🇧🇷"));

        list.add(new Channel("Cultura",
                "https://svs.itv.workers.dev/cultura",
                "Abertos", "🎭"));

        list.add(new Channel("Record News",
                "https://svs.itv.workers.dev/recordnews",
                "Abertos", "📰"));

        list.add(new Channel("Record",
                "https://svs.itv.workers.dev/record",
                "Abertos", "📺"));

        list.add(new Channel("RedeTV",
                "https://svs.itv.workers.dev/redetv",
                "Abertos", "📺"));

        list.add(new Channel("Band",
                "https://svs.itv.workers.dev/band",
                "Abertos", "🎵"));

        list.add(new Channel("SBT",
                "https://svs.itv.workers.dev/sbt",
                "Abertos", "⭐"));

        list.add(new Channel("Globo",
                "https://svs.itv.workers.dev/globo",
                "Abertos", "🌐"));

        // ── NOTÍCIAS ──────────────────────────────────────────────────
        list.add(new Channel("GloboNews",
                "https://svs.itv.workers.dev/globonews",
                "Notícias", "📡"));

        list.add(new Channel("CNN Brasil",
                "https://svs.itv.workers.dev/cnnbrasil",
                "Notícias", "🗞️"));

        list.add(new Channel("BandNews",
                "https://svs.itv.workers.dev/bandnews",
                "Notícias", "📻"));

        list.add(new Channel("TV Senado",
                "https://svs.itv.workers.dev/tvsenado",
                "Notícias", "🏛️"));

        list.add(new Channel("TV Câmara",
                "https://svs.itv.workers.dev/tvcamara",
                "Notícias", "🏛️"));

        // ── ESPORTES ──────────────────────────────────────────────────
        list.add(new Channel("SporTV",
                "https://svs.itv.workers.dev/sportv",
                "Esportes", "⚽"));

        list.add(new Channel("ESPN",
                "https://svs.itv.workers.dev/espn",
                "Esportes", "🏆"));

        list.add(new Channel("DAZN F1",
                "https://svs.itv.workers.dev/daznf1",
                "Esportes", "🏎️"));

        // ── FILMES/SÉRIES ─────────────────────────────────────────────
        list.add(new Channel("TCM",
                "https://svs.itv.workers.dev/tcm",
                "Filmes", "🎬"));

        list.add(new Channel("TNT",
                "https://svs.itv.workers.dev/tnt",
                "Filmes", "💥"));

        list.add(new Channel("Space",
                "https://svs.itv.workers.dev/space",
                "Filmes", "🚀"));

        list.add(new Channel("Warner",
                "https://svs.itv.workers.dev/warner",
                "Filmes", "🦸"));

        // ── INFANTIL ──────────────────────────────────────────────────
        list.add(new Channel("Cartoon Network",
                "https://svs.itv.workers.dev/cartoon",
                "Infantil", "🎠"));

        list.add(new Channel("Discovery Kids",
                "https://svs.itv.workers.dev/discoverykids",
                "Infantil", "🦁"));

        list.add(new Channel("Nick Jr",
                "https://svs.itv.workers.dev/nickjr",
                "Infantil", "🐣"));

        // ── DOCUMENTÁRIOS ─────────────────────────────────────────────
        list.add(new Channel("Discovery",
                "https://svs.itv.workers.dev/discovery",
                "Docs", "🔭"));

        list.add(new Channel("National Geographic",
                "https://svs.itv.workers.dev/natgeo",
                "Docs", "🌍"));

        list.add(new Channel("History",
                "https://svs.itv.workers.dev/history",
                "Docs", "📜"));

        list.add(new Channel("Animal Planet",
                "https://svs.itv.workers.dev/animalplanet",
                "Docs", "🐘"));

        return list;
    }
}
