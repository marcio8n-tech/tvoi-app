package com.tvoi.app;

import java.util.ArrayList;
import java.util.List;

public class ChannelList {

    public static List<Channel> getChannels() {
        List<Channel> list = new ArrayList<>();

        // ── ESPORTES ─────────────────────────────────────────────────
        list.add(new Channel("Cazé TV",
                "https://dfr80qz435crc.cloudfront.net/MNOP/Amagi/Caze/Caze_TV_BR/Caze_TV.m3u8",
                "Esportes", "📺"));
        list.add(new Channel("GE Fast",
                "https://dfr80qz435crc.cloudfront.net/EFGH/Amagi/Globo/GE_Fast_BR/GE_Fast.m3u8",
                "Esportes", "⚽"));
        list.add(new Channel("Combate",
                "https://cdn.live.br1.jmvstream.com/w/LVW-10842/LVW10842_513N26MDBL/chunklist.m3u8",
                "Esportes", "🥊"));
        list.add(new Channel("SporTV 1",
                "https://stm.sinalmycn.com/21000/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "🏆"));
        list.add(new Channel("SporTV 2",
                "https://stm.sinalmycn.com/21003/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "🏆"));
        list.add(new Channel("SporTV 3",
                "https://stm.sinalmycn.com/21006/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "🏆"));
        list.add(new Channel("SporTV Alt",
                "https://stm.sinalmycn.com/19024/video.m3u8",
                "Esportes", "🏆"));
        list.add(new Channel("Premiere 1",
                "https://stm.sinalmycn.com/20000/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 2",
                "https://stm.sinalmycn.com/20003/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 3",
                "https://stm.sinalmycn.com/20006/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 4",
                "https://stm.sinalmycn.com/20009/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 5",
                "https://stm.sinalmycn.com/20012/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 6",
                "https://stm.sinalmycn.com/20015/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 7",
                "https://stm.sinalmycn.com/20018/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));
        list.add(new Channel("Premiere 8",
                "https://stm.sinalmycn.com/20021/video.m3u8?token=EkP2qSi13ckjQRLSIDoxI5rMZsF5rZyEYzqWjxD248ScEUPYQ0",
                "Esportes", "⚽"));

        // ── ABERTOS ──────────────────────────────────────────────────
        list.add(new Channel("Record",
                "https://video08.logicahost.com.br/portaldatropical02/portaldatropical02/chunklist_w1846687537.m3u8",
                "Abertos", "📺"));
        list.add(new Channel("SBT",
                "https://stream.amsolution.net.br:8443/live/66db1cf131d45/index.m3u8",
                "Abertos", "⭐"));
        list.add(new Channel("Band",
                "https://5b7f3c45ab7c2.streamlock.net/arapuan/ngrp:arapuan_all/chunklist_w1159508898_b1596000.m3u8",
                "Abertos", "🎵"));
        list.add(new Channel("RedeTV",
                "https://tv01.zas.media:1936/redetvparana/redetvparana/chunklist_w354198329.m3u8",
                "Abertos", "📡"));
        list.add(new Channel("TV Brasil",
                "https://tvbrasil-stream.ebc.com.br/index.m3u8",
                "Abertos", "🇧🇷"));
        list.add(new Channel("Cultura",
                "https://player-tvcultura.stream.uol.com.br/live/tvcultura_lsd.m3u8",
                "Abertos", "🎭"));
        list.add(new Channel("SBT Rio",
                "https://live.cdn.upx.com/7550/myStream.sdp/chunklist.m3u8",
                "Abertos", "🌊"));
        list.add(new Channel("SBT BA",
                "https://cdn.live.br1.jmvstream.com/w/LVW-9359/LVW9359_XSyReL0QVf/chunklist.m3u8",
                "Abertos", "🟡"));
        list.add(new Channel("Gazeta",
                "https://video08.logicahost.com.br/tvc21/tvc21/chunklist_w1379780124.m3u8",
                "Abertos", "📰"));
        list.add(new Channel("Rede Brasil",
                "https://video09.logicahost.com.br/redebrasiloficial/redebrasiloficial/chunklist_w1.m3u8",
                "Abertos", "🌐"));
        list.add(new Channel("Rede Minas",
                "https://8hzcavccys.zoeweb.tv/redeminas/ngrp:redeminas_all/chunklist_w1639096618_b1500000.m3u8",
                "Abertos", "🟢"));
        list.add(new Channel("Aparecida",
                "https://cdn.live.br1.jmvstream.com/w/LVW-9716/LVW9716_HbtQtezcaw/chunklist.m3u8",
                "Abertos", "✝️"));
        list.add(new Channel("Novo Tempo",
                "https://stream.live.novotempo.com/tv/smil:tvnovotempo.smil/chunklist_b3628000_slpt.m3u8",
                "Abertos", "🕊️"));
        list.add(new Channel("Rede Vida",
                "https://d12e4o88jd8gex.cloudfront.net/out/v1/cea3de0b76ac4e82ab8ee0fd3f17ce12/index.m3u8",
                "Abertos", "💚"));

        // ── NOTÍCIAS ─────────────────────────────────────────────────
        list.add(new Channel("JP News",
                "https://d6yfbj4xxtrod.cloudfront.net/out/v1/7836eb391ec24452b149f3dc6df15bbd/index.m3u8",
                "Notícias", "🎙️"));
        list.add(new Channel("Record News",
                "https://rnw-rn.otteravision.com/rnw/rn/rnw_rn.m3u8",
                "Notícias", "📰"));
        list.add(new Channel("Canal Gov",
                "https://canalgov-stream.ebc.com.br/index.m3u8",
                "Notícias", "🏛️"));

        // ── FILMES ────────────────────────────────────────────────────
        list.add(new Channel("Filmes 1",
                "https://tvchannel.tvr.ovh/video28392/video28392/chunklist_w1896042040.m3u8",
                "Filmes", "🎬"));
        list.add(new Channel("Filmes 2",
                "https://stmv7.voxtvhd.com.br/clouding/clouding/playlist.m3u8",
                "Filmes", "🎬"));
        list.add(new Channel("Filmes 3",
                "https://video04.logicahost.com.br/isonata/isonata/chunklist_w233876096.m3u8",
                "Filmes", "🎬"));
        list.add(new Channel("Filmes 4",
                "https://video10.logicahost.com.br/redeistv/redeistv/chunklist_w368807261.m3u8",
                "Filmes", "🎬"));
        list.add(new Channel("Filmes 5",
                "https://stmv.webtvninjas.com.br/xtremetv54/xtremetv54/chunklist_w687835126.m3u8",
                "Filmes", "🎬"));

        // ── SÉRIES ────────────────────────────────────────────────────
        list.add(new Channel("Séries 1",
                "https://srv2.zcast.com.br/edgard4915/edgard4915/playlist.m3u8",
                "Séries", "🎭"));
        list.add(new Channel("Séries 2",
                "https://video04.logicahost.com.br/isonata/isonata/chunklist_w1623860370.m3u8",
                "Séries", "🎭"));
        list.add(new Channel("Séries 3",
                "https://stmv1.srvif.com/canal29/canal29/playlist.m3u8",
                "Séries", "🎭"));

        // ── VARIEDADES ────────────────────────────────────────────────
        list.add(new Channel("TV Anime",
                "https://stmv2.painelvideocast.com.br/animetv/animetv/chunklist_w1116279487.m3u8",
                "Variedades", "🎌"));
        list.add(new Channel("Loading TV",
                "https://stmv1.srvif.com/loadingtv/loadingtv/playlist.m3u8",
                "Variedades", "⏳"));
        list.add(new Channel("Vintage",
                "https://video01.kshost.com.br:4443/rogerio7271/rogerio7271/chunklist_w390891570.m3u8",
                "Variedades", "📼"));

        return list;
    }
}
