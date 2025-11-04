# LA Fashion Feed 

**By Malachi Madu**

A simple Java simulation (Code.org JavaLab–compatible) that explores how **social media engagement affects the environmental health of Los Angeles**.  
Each post represents a trend — users can "like" or "skip" posts, influencing the **City Health Meter** between -10% (collapse) and 110% (thriving).

---

## How It Works

- **Fast Fashion Likes** → reduce city health (more pollution, factories, and smog)
- **Sustainable Likes** → improve city health (green spaces, clean air)
- **Skips** → mild effects depending on post type
- **Visual Feedback** → ASCII art shows LA’s skyline changing from hazy to clear or collapsing

**Run flow:**
1. Compile and run `Main.java`
2. The console shows a feed of posts.
3. Type `like` or press **Enter** to skip each one.
4. At the end, the program summarizes your impact on Los Angeles.

---

## Files

| File | Purpose |
|------|----------|
| `Main.java` | Entry point — sets up posts and starts the simulation |
| `Feed.java` | Handles user choices, visuals, and city health logic |
| `Post.java` | Defines the data for each social media post |

---

## Theme Integration

This app ties into the project theme:
> *“What role does social media in Los Angeles play in promoting fast fashion trends, and how can we use it differently?”*

By visualizing how online engagement impacts the city’s health, it encourages mindful digital choices.

---

## Deployment & Compatibility

This program runs fully in **Code.org JavaLab** or any Java 17 environment (no external libraries required).


## Example Output

```
Post: #SheinHaul
Type: Fast Fashion
Reach: 4500 likes
Do you want to like this post? (type 'like' or press Enter to skip): like

You liked a fast fashion post.
Factories ramp up cheap production for viral trends.
Smog rolls over the Los Angeles skyline. City Health decreases to 43%.

City Health: [####------------] 43%
   (====)    Factory chimneys pump smoke into the air.
  (======)   Smog blankets downtown LA.
   ||  ||    Streets fill with waste from fast fashion.
--------------------------------
```

---

## Reflection

> “Every like or skip shaped the health of Los Angeles.  
> Social media can either heal or harm a city, depending on how we engage.”

---
