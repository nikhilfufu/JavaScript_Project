from openai import OpenAI

openai = OpenAI(
    api_key="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"
)

r = openai.ChatCompletion.create(
    model="gpt-3.5",
    messages=[
        {
            "role": "user",
            "content": "Top 10 cricketers"
        }
    ]
)

print(r.choices[0].message.content)
