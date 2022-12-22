// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/devtools/sourcerepo/v1/sourcerepo.proto

package com.google.devtools.sourcerepo.v1;

public interface ListReposResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.devtools.sourcerepo.v1.ListReposResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * The listed repos.
   * </pre>
   *
   * <code>repeated .google.devtools.sourcerepo.v1.Repo repos = 1;</code>
   */
  java.util.List<com.google.devtools.sourcerepo.v1.Repo> 
      getReposList();
  /**
   * <pre>
   * The listed repos.
   * </pre>
   *
   * <code>repeated .google.devtools.sourcerepo.v1.Repo repos = 1;</code>
   */
  com.google.devtools.sourcerepo.v1.Repo getRepos(int index);
  /**
   * <pre>
   * The listed repos.
   * </pre>
   *
   * <code>repeated .google.devtools.sourcerepo.v1.Repo repos = 1;</code>
   */
  int getReposCount();
  /**
   * <pre>
   * The listed repos.
   * </pre>
   *
   * <code>repeated .google.devtools.sourcerepo.v1.Repo repos = 1;</code>
   */
  java.util.List<? extends com.google.devtools.sourcerepo.v1.RepoOrBuilder> 
      getReposOrBuilderList();
  /**
   * <pre>
   * The listed repos.
   * </pre>
   *
   * <code>repeated .google.devtools.sourcerepo.v1.Repo repos = 1;</code>
   */
  com.google.devtools.sourcerepo.v1.RepoOrBuilder getReposOrBuilder(
      int index);

  /**
   * <pre>
   * If non-empty, additional repositories exist within the project. These
   * can be retrieved by including this value in the next ListReposRequest's
   * page_token field.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   * <pre>
   * If non-empty, additional repositories exist within the project. These
   * can be retrieved by including this value in the next ListReposRequest's
   * page_token field.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString
      getNextPageTokenBytes();
}