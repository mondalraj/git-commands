### Basic Git Commands
  git init 
  git status 
  git add {fileName} 
  git commit -m "commitMessage" 
  git push origin {branchName} 
  git clone {url} 
  git remote add origin {url} 

### Removing files from the stages area
  git restore --staged {fileName} 

### Watching all the commits till now
  git log 

### Removing commits from log history or move your version to specific commit (copy the commit ID after which you want to delete every commit)
  git reset {commit_ID} 

### Creating a new branch 
  git branch {branchName} 

### Moving your head to the new branch
  git checkout {branchName} 

### Moving the unstaged code to the back stage and make the working tree clean (You can fetch the code anytime)
  git stash 

### Bringing back the stash code
  git stash pop 

### Forced pushing a commit to a repo (If online repo is containing a commit but your remote folder does not have)
  git push origin {branchName} -f 

=> Keeping your remote/forked branch in Sync with the main branch 

### Fetching the updated repo code to your forked/remote repository
  git fetch --all --prune 

### Resetting the main brach of my origin to the main branch of my upstream
  git reset --hard upstream/main 

(Now push the changes to your forked repo) 

### Directly pulling the upstream changes to forked main branch 
  git pull upstream main 

### Merging multiple commits into 1 single commit
  git reset {commitID} 
  then add all files to staging area and then commit them under one ID 