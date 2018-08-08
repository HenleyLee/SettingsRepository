# SettingsRepository —— IDE 设置

IntelliJ IDEA 支持安装在不同计算机上的 IntelliJ IDEA（或其他基于 IntelliJ 平台的）产品的不同实例之间共享 IDE 设置。

如果您使用多个IntelliJ IDEA安装，或者希望在您的团队成员或公司范围内实施相同的设置，这将非常有用。

## 使用条件 ##
在开始使用 Settings Repository 之前，请确保 **Settings Repository** 插件已启用。该插件与IntelliJ IDEA 捆绑在一起，默认情况下处于激活状态。如果插件没有激活，请在 **Settings / Preferences Dialog** 对话框的 "插件" 页上启用它。

## 配置 Settings Repository ##
如果要共享IDE设置，请执行以下步骤：
1. 在任何托管服务上创建Git存储库，例如 [Bitbucket](https://bitbucket.org/) 或 [GitHub](https://github.com/)。
2. 在安装了要共享其设置的 IntelliJ IDEA 实例的计算机上，导航到 **File | Settings Repository**。指定创建的远程仓库的 URL，然后点击 **Overwrite Remote**。
3. 在要应用设置的每台计算机上，在 **Settings/Preferences dialog** 对话框中，展开 **Tools** 节点并选择 **Settings Repository**，指定创建的远程仓库的 URL，然后点击 **Overwrite Local**。
如果想要储存库保留远程设置和本地设置的组合，可以点击 **Merge**。如果检测到任何冲突，将显示一个对话框，可以在其中解决这些冲突。如果要使用本地设置覆盖远程设置，请单击点击 **Overwrite Remote**。

> 提示：如果选择使用 Bitbucket 托管你的存储库，建议使用应用程序密码进行身份验证。您需要为存储库设置读/写权限。

每次执行更新项目或推送操作时，或者当关闭项目或退出 IntelliJ IDEA 时，计算机的本地设置将自动与远程仓库中的设置同步。

如果要禁用自动设置同步，请导航到 **File | Settings | Tools | Settings Repository** 并禁用 **Auto Sync** 选项。您可以通过从主菜单选择 **VCS | Sync Settings** 来手动更新设置。

## 共享 IDE 认证 ##
在第一次同步时，系统将提示您指定用户名和密码。

建议使用 [access token](https://help.github.com/articles/creating-a-personal-access-token-for-the-command-line/) 进行 GitHub 身份验证。如果由于某种原因，您想要使用用户名和密码而不是 access token，或者您的 Git 托管服务提供商不支持它，建议您配置 [Git 凭证助手](https://help.github.com/articles/caching-your-github-password-in-git/)。

请注意：[macOS Keychain](https://support.apple.com/kb/PH20093)是受支持的，这意味着您可以在所有基于IntelliJ 平台的产品之间共享凭据（如果原始 IDE 与请求方 IDE 不同，系统将提示您授予访问权限）。

## 配置只读源 ##
除了 **Settings Repository**，可以配置任何数量的其他存储库，其中包含要共享的任何类型的设置，包括实时模板、文件模板、方案、部署选项等。

这些存储库被称为**只读源**，因为它们不能被覆盖或合并，仅用作设置源。

要配置此类存储库，请执行以下操作：
1. 在 **Settings / Preferences Dialog** 对话框中，展开 "工具" 节点，然后选择 "设置存储库"。
2. 单击“+”并添加包含要共享设置的 GitHub 存储库的 URL。

与只读源中的设置进行同步的方法与 **Settings Repository** 的方式相同。

## 参考 ##
[Sharing IDE Settings](https://www.jetbrains.com/help/idea/2017.1/sharing-your-ide-settings.html)

