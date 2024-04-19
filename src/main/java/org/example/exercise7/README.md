Git ilə ilkin tanışlıq.
1. git init --> Biz projectimizi versionlamaq istədikdə terminalımızı açaraq həmin qovluğa gəlirik.Daha sonra “git init” əmrini yazırıq. 
Beləliklə projectimizdə .git qovluğu yaranır və burada projectimizin kopyası saxlanılır. init komandası, qovluğu bir Git Repository halına gətirir və 
.git sonluqlu bir qovluq yaradır. Git init komandası qovluğumuzu uzaqdakı bir serverə göndərmək üçün hazır vəziyyətə gətirir.

2. git add --> add komandası hər-hansı bir yeni faylı və ya qovluqdakı bütün faylları əlavə edir.

3. git commit --> Commit ilə etdiyimiz dəyişikliklər haqqında açıqlamaları qeyd edirik.
Commit proyektimizi staging area -dan (Hazırlıq sahəsi)local repository bölməsinə keçirir. git commit –m “ bu ilk commitdir”.

4. git status --> Projectdəki fayılların həmin ankı vəziyyətini göstərir və olunmuş dəyişiklikləri göstərir.

5. git log --> , git repository-də olan commit tarixçəsini göstərir. Bu əmr, əvvəlindən son commit-ə qədər olan bütün commitlərin məlumatlarını göstərir.
Bu məlumatlar hər bir commit üçün uniq SHA-1 hash identifikatoru, müəllif adı və e-poçt ünvanı, commit tarixi, və commit əmrinə qeyd olunan mesajı əhatə edir.

6. git push --> yerli git repository-də yerləşən dəyişiklikləri uzak repository-ə,
GitHub, GitLab və ya Bitbucket kimi serverlərə göndərmək üçün istifadə olunur.

7. git pull --> remote repository-də olan dəyişiklikləri lokal repository-ə çəkir.