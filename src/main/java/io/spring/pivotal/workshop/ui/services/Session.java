package io.spring.pivotal.workshop.ui.services;

import java.util.List;

public class Session {

	private String id;
	private String name;
	private String description;
	private List<Topic> topics;

	public Session(String id, String name, String description) {
		this.id = id;
		this.name = name;
		this.description = description;
	}

	public Session() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Topic> getTopics() {
		return topics;
	}

	public void setTopics(List<Topic> topics) {
		this.topics = topics;
	}

	public static class Topic {

		private String id;
		private String title;
		private String description;
		private String slideURL;
		private String labURL;
        private String videoURL;

		public Topic() {
		}

		public Topic(String id, String title, String description, String slideURL, String labURL, String videoURL) {
			super();
			this.id = id;
			this.title = title;
			this.description = description;
			this.slideURL = slideURL;
			this.labURL = labURL;
            this.videoURL = videoURL;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getSlideURL() {
			return slideURL;
		}

		public void setSlideURL(String slideURL) {
			this.slideURL = slideURL;
		}

		public String getLabURL() {
			return labURL;
		}

		public void setLabURL(String labURL) {
			this.labURL = labURL;
		}

        public String getVideoURL() {
            return videoURL;
        }

        public void setVideoURL(String videoURL) {
            this.videoURL = videoURL;
        }
	}

}
