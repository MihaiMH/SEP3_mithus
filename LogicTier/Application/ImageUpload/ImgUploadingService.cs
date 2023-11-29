namespace Application.ImageUpload;

public static class ImgUploadingService
{
    private static string apiKey = "ea88cd982c04443374fc1eb50bbf8908";
    private static string url = $"https://api.imgbb.com/1/upload?key={apiKey}";


    public static async Task<string> UploadImage(byte[] imgData)
    {
        using (HttpClient client = new HttpClient())
        {
            using (var content = new MultipartFormDataContent())
            {
                // ByteArrayContent imgContent = new ByteArrayContent(imgData);
                string base64String = Convert.ToBase64String(imgData);
                content.Add(new StringContent(base64String), "image");

                HttpRequestMessage request = new HttpRequestMessage(HttpMethod.Post, url) { Content = content };
                var response = await client.SendAsync(request);

                if (response.IsSuccessStatusCode)
                {
                    string responseContent = await response.Content.ReadAsStringAsync();

                    string imageUrl = responseContent.Split("\"url\":\"")[1].Split("\"")[0];
                    return imageUrl;
                }


                throw new Exception("Error uploading image. Status code: " + response.StatusCode);
            }
        }
    }
}