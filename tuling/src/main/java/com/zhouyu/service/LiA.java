package com.zhouyu.service;

public class LiA{
	public  <T> void test(T t){
		System.out.println(t);
	}
	public static void main(String[] args) {
		new LiA().test("hello");
	}

/*

 pathspec 'Demo2.txt' did not match any file(s) known to git


fatal: unable to access 'https://github.com/xiadancheng/GitResp2.git/': OpenSSL SSL_read: Connection was reset, errno 10054

$ git push origin master
fatal: unable to access 'https://github.com/xiadancheng/GitResp2.git/': Failed to connect to github.com port 443 after 21069 ms: Timed out

	On branch master
	Your branch is ahead of 'origin/master' by 10 commits.
			(use "git push" to publish your local commits)*/


	/*You are in 'detached HEAD' state. You can look around, make experimental
changes and commit them, and you can discard any commits you make in this
state without impacting any branches by switching back to a branch.
*/

	/*error: failed to push some refs to 'https://github.com/xiadancheng/GitResp2.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
*/

	/*fatal: unable to access 'https://github.com/xiadancheng/GitResp2.git/': OpenSSL SSL_read: Connection was reset, errno 10054
	 */


/*$ git push origin_ssh master
The authenticity of host 'github.com (20.205.243.166)' can't be established.
ED25519 key fingerprint is SHA256:+DiY3wvvV6TuJJhbpZisF/zLDA0zPMSvHdkr4UvCOqU.
This key is not known by any other names
Are you sure you want to continue connecting (yes/no/[fingerprint])? y
Please type 'yes', 'no' or the fingerprint:
Host key verification failed.
fatal: Could not read from remote repository.

Please make sure you have the correct access rights
and the repository exists.
*/

	/* ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'github.com:xiadancheng/GitResp2.git'
*/


	/* ! [rejected]        master -> master (fetch first)
error: failed to push some refs to 'github.com:xiadancheng/GitResp2.git'
hint: Updates were rejected because the remote contains work that you do
hint: not have locally. This is usually caused by another repository pushing
hint: to the same ref. You may want to first integrate the remote changes
hint: (e.g., 'git pull ...') before pushing again.
hint: See the 'Note about fast-forwards' in 'git push --help' for details.
*/
}
