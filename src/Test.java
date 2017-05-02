import com.wulitao.netease.dto.LyricDto;
import com.wulitao.netease.utils.SongUtil;


public class Test {

	public static void main(String[] args) {
		System.setProperty("http.proxySet", "true"); 
		System.setProperty("http.proxyHost", "127.0.0.1"); 
		System.setProperty("http.proxyPort", "8888");
		long songId = 439915614L;
		
		long start = System.currentTimeMillis();
		
		/*CommentDto dto = new CommentDto();
		dto.setOffset("0");
		dto.setLimit("10");
		dto.setSongId(songId);
		Map<String, Object> map = SongUtil.getSongComments(dto);
		@SuppressWarnings("unchecked")
		List<Comment> comments = (List<Comment>) map.get("comments");
		for (Comment comment : comments) {
			System.out.println(comment.getContent());
			if (comment.getBeReplied() != null) {
				for (ReplyComment replyComment : comment.getBeReplied()) {
					System.out.println("----" + replyComment.getContent());
				}
			}
			System.out.println();
		}*/
		
		LyricDto dto = new LyricDto();
		dto.setId(songId + "");
		String lyric = SongUtil.getLyric(dto);
		System.out.println(lyric);
		
		
		
		/*String str = HttpUtil.getInstance().connect("http://210.42.72.73:888/jwweb/_data/index_LOGIN.aspx")
				.cookie("ASP.NET_SessionId", "1y5qzf3ifo3tmn45rt3hpa33")
				.data("dsdsdsdsdxcxdfgfg", "E34BEC5003BBD5BB9E663D3C5CBC12")
				.data("fgfggfdgtyuuyyuuckjg", "89D9F43D4AC8E97F04392F4788A993")
				.data("Sel_Type", "STU")
				.data("txt_asmcdefsddsd", "ADSFA")
				.get();*/
		/*HttpUtil.getInstance().connect("http://210.42.72.73:888/jwweb/sys/ValidateCode.aspx")
			.stream()
			.async()
			.callBack(new HttpUtil.Callback() {

				@Override
				public void success(HttpURLConnection connection, Object response) {
					HttpCookie cookie = HttpUtil.getCookieByName(connection, "ASP.NET_SessionId");
					System.out.println(cookie);
					
					InputStream is = (InputStream) response;
					File file = new File("D:\\test.png");
					try {
						FileOutputStream fos = new FileOutputStream(file);
						// 设置缓存区大小为1kb
						byte[] buffer = new byte[1024];
						int len;
						while ((len = is.read(buffer)) != -1) {
							fos.write(buffer, 0, len);
						}
						fos.close();
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			})
			.get();*/
//		System.out.println(str);
		
		/*String name = "刚好遇见你";
		SongDto dto = new SongDto();
		dto.setName(name);
		dto.setOffset("0");
		dto.setLimit("20");
		JSONObject object = SongUtil.getSongsInfoByName(dto);
		System.out.println(object.toJSONString());*/
		
//		AccountUtil.loginByPhone("18271855087", "scq2xd");
		
		/*Url url = SongUtil.getSongUrl(439915614L);
		System.out.println(url.getUrl());*/
		
//		boolean success = FileUtil.downloadFile("", "F:/test.mp3");
//		System.out.println(HttpUtil.getInstance().connect("http://www.baidu.com").get());
		
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
	}

}
