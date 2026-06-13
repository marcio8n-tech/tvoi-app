package com.tvoi.app;

import java.util.ArrayList;
import java.util.List;

public class ChannelList {

    public static List<Channel> getChannels() {
        List<Channel> list = new ArrayList<>();

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
        list.add(new Channel("SBT GO",
                "https://sbtnews.maissbt.com/3.m3u8",
                "Abertos", "🟡"));
        list.add(new Channel("SBT BA",
                "https://cdn.live.br1.jmvstream.com/w/LVW-9359/LVW9359_XSyReL0QVf/chunklist.m3u8",
                "Abertos", "🟡"));
        list.add(new Channel("SBT Interior",
                "https://video05.logicahost.com.br/tvguajara/tvguajara/chunklist_w892447505.m3u8",
                "Abertos", "🟡"));
        list.add(new Channel("Rec MT",
                "https://cdn.live.br1.jmvstream.com/w/LVW-10842/LVW10842_513N26MDBL/chunklist.m3u8",
                "Abertos", "🔴"));
        list.add(new Channel("Gazeta",
                "https://video08.logicahost.com.br/tvc21/tvc21/chunklist_w1379780124.m3u8",
                "Abertos", "📰"));
        list.add(new Channel("Rede Brasil",
                "https://video09.logicahost.com.br/redebrasiloficial/redebrasiloficial/chunklist_w1.m3u8",
                "Abertos", "🌐"));
        list.add(new Channel("Rede Minas",
                "https://8hzcavccys.zoeweb.tv/redeminas/ngrp:redeminas_all/chunklist_w1639096618_b1500000.m3u8",
                "Abertos", "🟢"));
        list.add(new Channel("Rede Minas 2",
                "https://cdn.live.br1.jmvstream.com/w/LVW-15748/LVW15748_Yed7yzLuRC/chunklist.m3u8",
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
        list.add(new Channel("Futura",
                "https://sbtnews.maissbt.com/3.m3u8",
                "Abertos", "🎓"));

        // ── NOTÍCIAS ──────────────────────────────────────────────────
        list.add(new Channel("Jovem Pan",
                "https://amg01391-amg01391c3-tcl-spain-5038.playouts.now.amagi.tv/playlist1080-p.m3u8",
                "Notícias", "🎙️"));
        list.add(new Channel("Banda News",
                "https://sbtnews.maissbt.com/3.m3u8",
                "Notícias", "📻"));

        // ── ESPORTES ──────────────────────────────────────────────────
        list.add(new Channel("Combate",
                "https://cdn.live.br1.jmvstream.com/w/LVW-10842/LVW10842_513N26MDBL/chunklist.m3u8",
                "Esportes", "🥊"));

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
        list.add(new Channel("Séries 2",
                "https://srv2.zcast.com.br/edgard4915/edgard4915/playlist.m3u8",
                "Séries", "🎭"));
        list.add(new Channel("Séries 3",
                "https://video04.logicahost.com.br/isonata/isonata/chunklist_w1623860370.m3u8",
                "Séries", "🎭"));
        list.add(new Channel("Séries 4",
                "https://stmv1.srvif.com/canal29/canal29/playlist.m3u8",
                "Séries", "🎭"));

        // ── CULINÁRIA ────────────────────────────────────────────────
        list.add(new Channel("Culinária 1",
                "https://live.cdn.upx.com/7550/myStream.sdp/chunklist.m3u8",
                "Culinária", "🍽️"));
        list.add(new Channel("Culinária 2",
                "https://amg00627-banijay-amg00627c9-plex-us-1999.playouts.now.amagi.tv/playlist/index.m3u8",
                "Culinária", "👨‍🍳"));

        // ── VARIEDADES ────────────────────────────────────────────────
        list.add(new Channel("Loading TV",
                "https://stmv1.srvif.com/loadingtv/loadingtv/playlist.m3u8",
                "Variedades", "⏳"));
        list.add(new Channel("TV Anime",
                "https://stmv2.painelvideocast.com.br/animetv/animetv/chunklist_w1116279487.m3u8",
                "Variedades", "🎌"));
        list.add(new Channel("Vintage",
                "https://video01.kshost.com.br:4443/rogerio7271/rogerio7271/chunklist_w390891570.m3u8",
                "Variedades", "📼"));

        return list;
    }
}
