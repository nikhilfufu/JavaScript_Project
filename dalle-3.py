from openai import OpenAI
open = OpenAI(
    api_key="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"
)

r=open.images.generate(
    model="dall-e-3",
    prompt = "virat kohli"
)
print(r.data[0].url)