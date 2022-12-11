Download github cli:
gh release download --repo microsoft/nubesgen --pattern='nubesgen-cli-windows.exe'
Go inside the project you want to deploy.
az login
nubesgen-cli-windows.exe gitops

Set storage account security network "Allow Azure services on the trusted services list to access this storage account"


curl "https://nubesgen.com/springbootserver.zip?iactool=TERRAFORM&region=westeurope&application=SPRING_CLOUD.basic&runtime=DOCKER&database=NONE.free&gitops=true" | tar -xzvf -
curl "https://nubesgen.com/springbootserver.tgz?iactool=TERRAFORM&region=northeurope&application=SPRING_CLOUD.standard&runtime=SPRING&database=NONE.free&gitops=true" | tar -xzvf -



export MSYS_NO_PATHCONV=1
az ad sp create-for-rbac --name "springbootserver" --role contributor --scopes /subscriptions/df235385-c7e7-42e2-85d6-3ec17addf4e1/resourceGroups/rg-terraform-001 --sdk-auth

{
"clientId": "16b79fce-7e55-42c0-8b12-9bb84bd6844c",
"clientSecret": "I4N8Q~mdirCbrpuDx2d0yjwTziNnnxP34xiofcTU",
"subscriptionId": "12ce209f-017f-4282-ac24-76be9bc4815c",
"tenantId": "2181adee-861f-489e-a023-c11fa8016761",
"activeDirectoryEndpointUrl": "https://login.microsoftonline.com",
"resourceManagerEndpointUrl": "https://management.azure.com/",
"activeDirectoryGraphResourceId": "https://graph.windows.net/",
"sqlManagementEndpointUrl": "https://management.core.windows.net:8443/",
"galleryEndpointUrl": "https://gallery.azure.com/",
"managementEndpointUrl": "https://management.core.windows.net/"
}


go to github - project - settings - secrets
Create "AZURE_CREDENTIALS"
Post value from output from az 

provider "azurerm" {
skip_provider_registration = "true"
features {}
}

git config --global core.autocrlf false
git commit & push to trigger github action (only in branch starting with env-***).
Like:
git commit -am "gitops" && git tag -a v0.2.6 -m "v0.2.6" && git push origin --tags && git push
git commit -am "gitops" && git push



