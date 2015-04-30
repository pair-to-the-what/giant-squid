import java.util

import org.giant.squid.GitRepoAccessor
import org.gitlab.api.GitlabAPI
import org.gitlab.api.models.GitlabProject
import org.scalamock.scalatest.MockFactory
import org.scalatest.FunSuite

class GitRepoAccessorSpec extends FunSuite with MockFactory {

  test("An empty Set should have size 0") {
    assert(Set.empty.size == 0)
  }

  test("Invoking head on an empty Set should produce NoSuchElementException") {
    intercept[NoSuchElementException] {
      Set.empty.head
    }
  }


  test("dogfish head"){

      val apiMock = mock[GitlabAPI]
      (apiMock.getAllProjects _).expects().returning(new util.ArrayList[GitlabProject])
      assert(new GitRepoAccessor(apiMock).GetProjects().size == 0)
  }
}
