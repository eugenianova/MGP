/*
 * MIT License
 *
 * Copyright (c) 2018 Soojeong Shin
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.example.android.newsfeed;

/**
 * Объект {@link News} содержит информацию относящуюся к конкретной новости.
 */

public class News {

    /** Title of the article */
    private String mTitle;

    /** Section name of the article*/
    private String mSection;

    /** Author name in the article */
    private String mAuthor;

    /** Web publication date of the article */
    private String mDate;

    /** Website URL of the article */
    private String mUrl;

    /** Thumbnail of the article */
    private String mThumbnail;

    /** TrailText of the article with string type Html */
    private String mTrailTextHtml;

    /**
     * Constructs a new {@link News} object.
     *
     * @param title is the title of the article
     * @param section is the section name of the article
     * @param author is author name in article
     * @param date is the web publication date of the article
     * @param url is the website URL to find more details about the article
     * @param thumbnail is the thumbnail of the article
     * @param trailText is trail text of the article with string type Html
     */
    public News(String title, String section, String author, String date, String url, String thumbnail, String trailText) {
        mTitle = title;
        mSection = section;
        mAuthor = author;
        mDate = date;
        mUrl = url;
        mThumbnail = thumbnail;
        mTrailTextHtml = trailText;
    }

    /**
     * Врзвращаем title статьи
     */
    public String getTitle() {
        return mTitle;
    }

    /**
     * Возвращает раздел статьи.
     */
    public String getSection() {
        return mSection;
    }

    /**
     * Возвращает имя автора статьи
     */
    public String getAuthor() {
        return mAuthor;
    }
    /**
     * Возвращает дату публикации статьи
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Возвращает ссылку URL статьи
     */
    public String getUrl() {
        return mUrl;
    }

    /**
     *Ввозвращает короткое описание статьи
     */
    public String getThumbnail() {
        return mThumbnail;
    }

    /**
     * Returns the TrailText of the article with string type Html
     */
    public String getTrailTextHtml() {
        return mTrailTextHtml;
    }
}
