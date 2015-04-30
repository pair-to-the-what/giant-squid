package org.giant.squid

import org.gitlab.api.GitlabAPI
import org.gitlab.api.models.GitlabProject
import scala.collection.JavaConversions.asScalaBuffer

class GitRepoAccessor(api: GitlabAPI) {

  def GetProjects(): List[GitlabProject] = {
    api.getAllProjects().toList
  }
}
