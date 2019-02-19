package org.venuspj.models.fundamentals;

public class Comment {
  private String value;

  /**
   * コンストラクター.
   * @param value Comment
   */
  protected Comment(String value) {
      this.value = value;
  }

  /**
   * 値を取得する
   * @return 値を取得する
   */
  public String getValue() {
    return value;

  }

  /**
   * Nameインスタンスを取得する
   * @param value コメント
   * @return valueの設定されたCommentオブジェクト
   */
  public static Comment of(String value) {
      return  new Comment(value);

  }

}
