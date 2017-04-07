package io.spring.pivotal.workshop.ui.services;

public class Content {

	private String courseID;
	private String title;
	private String section;
	private String description;
	private String slideURL;
	private String labURL;
    private String videoURL;

	public Content() {
	}

	public Content(String courseID, String title, String section, String description, String slideURL, String labURL, String videoURL) {
		this.courseID = courseID;
		this.title = title;
		this.section = section;
		this.description = description;
		this.slideURL = slideURL;
		this.labURL = labURL;
        this.videoURL = videoURL;
	}

	public String getCourseID() {
		return courseID;
	}

	public void setCourseID(String courseID) {
		this.courseID = courseID;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSection() {
		return section;
	}

	public void setSection(String section) {
		this.section = section;
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
